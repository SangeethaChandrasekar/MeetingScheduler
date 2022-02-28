package com.example.Assignment.Meeting.PairPersons;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.CollectionUtils.isEmpty;

public class PairingClass {
    static Logger log = Logger.getLogger(KWFour.class.getClass());

    public ArrayList makePairing(ArrayList fixMeeting) {
        for (int itr = 0; itr < fixMeeting.size() - 1; itr++) {
            List stream1 = fixMeeting.subList(0, fixMeeting.size() / 2);
            List stream2 = fixMeeting.subList(fixMeeting.size() / 2, fixMeeting.size());
            log.info("Schedule for Day " + (itr + 1));
            for (int i = 0; i < (fixMeeting.size()) / 2; i++) {
                log.info(stream1.get(i) + " :: " + stream2.get(stream2.size() - 1 - i));
            }
            log.info("::::::======::::::");
            fixMeeting.add(1, fixMeeting.get(fixMeeting.size() - 1));
            fixMeeting.remove(fixMeeting.size() - 1);
        }
        return fixMeeting;
    }

    public boolean scheduleMeeting(ArrayList fixMeeting) {
        if (isEmpty(fixMeeting)) {
            log.info("===Empty===");
            return true;
        } else if ((fixMeeting.size()) % 2 == 1) {
            fixMeeting.add("No pair to meet today");
            makePairing(fixMeeting);
        } else {
            makePairing(fixMeeting);
        }
        return false;
    }
}
