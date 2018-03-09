package com.company.IFT.OS;

import com.company.IFT.Core.Kernel;

import java.util.ArrayList;

/**
 * Created by rafaelszuminski on 2/13/18.
 */
public class Linux extends Kernel {
    String flavor;
    String command;

    public Linux(String f, String k, String s){
        super(k,s);
        flavor = f;
        command = s;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getKernelVersion() {
        return super.getKernelVersion();
    }

    public String getCommand() {
        return command;
    }

    @Override
    public void setKernelVersion(String kernelVersion) {
        super.setKernelVersion(kernelVersion);
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return  "[Linux "+getFlavor()+"]"+"\n"+
                "[Using Kernel]: "+getKernelVersion()+"\n"+
                "[Command]: "+actionToBinary(command);
    }
}
