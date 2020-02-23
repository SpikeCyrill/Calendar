package com.brunoyam.Calendar;

public enum KeyType {

    MONTH("-m", 1, 12),
    DAY("-d", 1, 365);

    private String key;
    private Integer minValue;
    private Integer maxValue;

    KeyType(String key, Integer minValue, Integer maxValue) {
        this.key = key;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public String getKey() {
        return key;
    }

    public static KeyType getByString(String keyString) {

        KeyType currentKey = null;

        for(Integer i = 0; i < values().length; i++) {
            if(keyString.equals(values()[i].getKey())) {
                currentKey = values()[i];
            }
        }
        return currentKey;
    }

}
