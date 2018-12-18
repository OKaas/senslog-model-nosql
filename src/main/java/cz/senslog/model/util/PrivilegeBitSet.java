package cz.senslog.model.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.BitSet;

public class PrivilegeBitSet extends BitSet{

    private static final int PRIVILEGE_BITS = 64;
    private static final Logger LOGGER = LoggerFactory.getLogger(PrivilegeBitSet.class);

    public PrivilegeBitSet() {
        super(PRIVILEGE_BITS);
    }

    public PrivilegeBitSet(String stringBits) {
        this();

        if(stringBits.length() != PRIVILEGE_BITS) {
            LOGGER.warn("Privilege \'{}\' does not fit requested privilege length \'{}\'", stringBits, PRIVILEGE_BITS);
            return;
        }

        for (int i = 0; i < PRIVILEGE_BITS; i++) {
            if(stringBits.charAt(i) == '1') {
                this.set(i);
            }
        }
    }
}
