package com.prog.cnv.sys.control.system.control;

public class Restore {

    public boolean restoreDatabase(String dbUserName, String dbPassword, String source) {
        String[] executecmd = new String[]{"C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysql.exe", "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source " + source};

        Process runtimeProcess;

        try {
            runtimeProcess = Runtime.getRuntime().exec(executecmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {
                //System.out.println("Success");
                return true;
            } else {
                //System.out.println("Error");
                return false;
            }
        } catch (Exception e) {
            //System.out.println("Error -- " + e);
        }
        return false;
    }
}
