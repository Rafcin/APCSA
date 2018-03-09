package com.company.IFT.Core;

import com.company.IFT.Core.KernelPkg.BinaryConversion;
import com.company.IFT.Terminal;

/**
 * Created by rafaelszuminski on 2/12/18.
 */
public class Kernel extends BinaryConversion {

    String kernelVersion;
    String commandS;

    public Kernel(String k,String s){
        kernelVersion = k;
        commandS = s;
    }

    public String actionToBinary(String s){
        return toBinary(s,8);
    }

    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public String getCommandS() {
        return commandS;
    }

    public void setCommandS(String commandS) {
        this.commandS = commandS;
    }

    @Override
    public String toString() {
        return "[Kernel Version]: "+getKernelVersion();
    }

}
