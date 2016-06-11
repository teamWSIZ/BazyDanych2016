package Service;


import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.Date;

@Component
public class KasaService {
    @Autowired
    TransferRe tre;
    @Autowired
    PersonaRe pre;
    @Autowired
    SnapshotRe sre;

    @Transactional
    public void transferIt(TransferRe tre) {
        Transfer nowy = Transfer.builder().personid(1).amount(2).timestamp(new Date()).build();
        System.out.println(TransactionSynchronizationManager.isActualTransactionActive());
        tre.save(nowy);

    }

    @Transactional
    public void przelew(Integer pidFrom, Integer pidTo, Integer trAmount) {
        Persona from = pre.findOne(pidFrom);
        Persona to = pre.findOne(pidTo);
        if (from==null || to==null) throw new RuntimeException();
        if (from.getMoney()-trAmount<-100) throw new RuntimeException();//nie mozna mieć mniej niż -100

        System.out.println("True?==" + TransactionSynchronizationManager.isActualTransactionActive());

        //zmiana kont
        from.setMoney(from.getMoney() - trAmount);
        to.setMoney(to.getMoney() + trAmount);
        pre.save(from);
        pre.save(to);

        System.out.println("True?==" + TransactionSynchronizationManager.isActualTransactionActive());

        //log transakcji
        Transfer transferFrom = new Transfer();
        Date timestampTransferu = new Date();
        transferFrom.setAmount(-trAmount);
        transferFrom.setPersonid(pidFrom);
        transferFrom.setTimestamp(timestampTransferu);
        Transfer transferTo = new Transfer();
        transferTo.setAmount(trAmount);
        transferTo.setPersonid(pidTo);
        transferTo.setTimestamp(timestampTransferu);
        tre.save(transferFrom);
        tre.save(transferTo);

        System.out.println("True?==" + TransactionSynchronizationManager.isActualTransactionActive());


    }
}
