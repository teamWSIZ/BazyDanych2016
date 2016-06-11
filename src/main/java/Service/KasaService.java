package Service;


import model.PersonaRe;
import model.SnapshotRe;
import model.Transfer;
import model.TransferRe;
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
}
