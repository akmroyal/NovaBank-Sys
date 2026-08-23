package com.novabank.common.util;

public final class AccountNumGenerator {
        private static Long initialNum = 1000001L;

        private AccountNumGenerator(){
            // prevent object creation
        }

        public static Long generate(){
            return ++initialNum;
        }
}
