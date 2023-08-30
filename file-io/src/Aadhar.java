public class Aadhar {

    private final long uid;

    private final String retina;

    public Aadhar(long uid, String retina) {
        this.uid = uid;
        this.retina =retina;

    }

 

    @Override

    public String toString() {

        return "Aadhar [uid=" + uid + ", retina=" + retina + "]";

    }

 

    public long getUid() {

        return uid;

    }

 

    public String getRetina() {

        return retina;

    }

 

    public static void main(String[] args) {
    	Aadhar a1 = new Aadhar(123124214344312L, "Kuchbi");
    	System.out.println(a1);
        

    }

 

}