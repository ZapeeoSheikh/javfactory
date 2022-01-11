import java.util.Scanner;
// This is the time table of my Semester 02 made through 2D array
//            15-june-20  --> Tuesday

public class time_table_2D_Array {
    public static void main(String[] args) {
        Scanner zap = new Scanner (System.in);
        System.out.println("Subject includes : ");
        System.out.println("{\"dld\",\"algebra\",\"stats\",\"communication\",\"opp\",\"opplab\",\"dldlab\"}\n");
        String[][] arr1 = {
                           {"dld","algebra","stats","communication","opp","opplab","dldlab"},
                           {"\tTues 8:00 - 9:30 \n\tThurs 8:00 - 9:30","\tTues 12:30 - 2:00\n\tFri 11:00 - 12:30","\tMon 9:30 - 11:00 \n\tThurs 9:30 - 11:00","\tTues 9:30 - 11:00\n\tThurs 12:30 - 2:00","\tTues 11:00 - 12:30\n\tThurs 11:00 - 12:30","\tFri 9:00 - 11:00","\tMon 11:00 - 12:30 \n\t"}
        };
        try {
            while (true) {
                System.out.println(" Enter the name of the course/subject : ");
                String sample = zap.next();

                for (int i = 0; i <= 6; i++) {
                    if (sample.equals(arr1[0][i])) {
                        System.out.println("Timing : \n" + arr1[1][i]);
                        break;
                    } else if (i == 6) {
                        if (sample.equals(arr1[0][i])) {
                            System.out.println("Timing : \n" + arr1[1][i]);
                            break;
                        } else
                            System.out.println(" Course doesn't found ! ");
                        break;
                    }
                }
                System.out.println("Press 0 to Exit and any number for continue..");
                int user = zap.nextInt();
                if (user == 0) {
                    System.exit(0);
                }
            }

        }catch (Exception e){
            System.out.println(" Sorry, Program terminated because you have Voilate the Rules ");
        }

//     Muhammad Rameez
//       0090-Bscs-20
//     Government College University Lahore

    }
}
