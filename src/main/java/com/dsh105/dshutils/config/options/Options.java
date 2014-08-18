package com.samistine.echopet.libraries.dshutils.config.options;

import com.samistine.echopet.libraries.dshutils.config.YAMLConfig;


public abstract class Options {

    protected YAMLConfig config;

    public Options(YAMLConfig config) {
        this.config = config;
        this.setDefaults();
    }

    public abstract void setDefaults();

    public YAMLConfig getConfig() {
        return this.config;
    }

    protected void set(String path, Object defObject, String... comments) {
        this.config.set(path, this.config.get(path, defObject), comments);
    }
}