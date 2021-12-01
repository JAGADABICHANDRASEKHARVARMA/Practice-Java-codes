import com.chandu.test.Student;

import java.io.*;
class SerializeExample
{
    public static void main(String [] args)
    {
        Student st = new Student();
        st.name = "Allen";
        st.address = "TX, USA";
        st.userId = "Aln";
        st.pwd = "Aln123$";
        try
        {
            //Create file output stream
            FileOutputStream fileOutStr =
                    new FileOutputStream("student.ser");
            //Create object output stream and write object
            ObjectOutputStream objOutStr = new ObjectOutputStream(fileOutStr);
            objOutStr.writeObject(st);
            //Close all streams
            objOutStr.close();
            fileOutStr.close();
            System.out.printf("Serialized data is saved in a file  - student.ser");
        }catch(IOException exp)
        {
            exp.printStackTrace();
        }
    }
}