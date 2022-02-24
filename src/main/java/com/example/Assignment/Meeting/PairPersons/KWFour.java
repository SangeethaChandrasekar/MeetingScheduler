package com.example.Assignment.Meeting.PairPersons;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class KWFour {
    static Logger log = Logger.getLogger(KWFour.class.getClass());
    public ArrayList persons;

    KWFour(ArrayList persons) {
        this.persons = persons;
    }

    public static void main(String[] args) {
        ArrayList personMeeting = new ArrayList(Arrays.asList("Arbaaz", "Ankita", "Gowthami", "Nilesh", "Roger", "Rohit", "Sangeetha", "Sambasiva", "Sidharth", "Omprakash"));
        KWFour obj = new KWFour(personMeeting);
        PairingClass obj2 = new PairingClass();
        obj2.scheduleMeeting(personMeeting);
    }
    //trial

}
