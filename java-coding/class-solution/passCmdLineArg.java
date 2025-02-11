class passCmdLineArg{
    public static void main(String arg[]) {
        for(int i=0; i<arg.length; i++){
            // System.out.println(arg[i]);
            int val = Integer.parseInt(arg[i]);
            System.out.println(val);
        }
    }
}