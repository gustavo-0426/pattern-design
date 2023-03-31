package com.co.softworld;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Receiver {

    public void success() {
        log.info("transaction approved");
    }

    public void credit() {
        log.info("credit to account");
    }

    public void debit() {
        log.info("debit to account");
    }

    public void failed() {
        log.info("transaction failed");
    }

    public void creditInvalid() {
        log.info("not credit");
    }

    public void debitInvalid() {
        log.info("not debit");
    }
}
