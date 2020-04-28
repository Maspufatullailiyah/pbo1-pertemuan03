package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs : \"Terima Kasih pak\"");
                System.out.println("Dosen : \"Terima Kasih pak\"");
                break;
            case 'B':
                 System.out.println("Mhs : \"Kenapa ulun kada dapat A pak?\"");
                 System.out.println("Dosen : \"NANI??\"");
                 break;
            case 'C':
                  System.out.println("Mhs : \"Ulun turun full pak, tugas juga ngumpul\"");
                  System.out.println("Dosen : \"tapi bisa lah jawab ujian?\"");
                  System.out.println("Mhs : \"hehe\"");
                  break;
            default:
                   System.out.println("Mhs : \"ulun masuk kuliah full pak, tugas juga ngumpul juga\"");
                   System.out.println("Dosen : \"masa?\"");
                   System.out.println("Mhs : \"iya pak\"");
                   System.out.println("Dosen : \"bodo. wkwkwkwk\"");
                   break;

        }
    }
}
