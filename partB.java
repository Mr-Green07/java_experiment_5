// import java.io.*;

// package java_experiment_5;

// public class partB {
    
// }
// class Student implements Serializable {
//     private static final long serialVersionUID = 1L;
//     private final int studentID;
//     private final String name;
//     private final double grade;

//     Student(int studentID, String name, double grade) {
//         this.studentID = studentID;
//         this.name = name;
//         this.grade = grade;
//     }

//     public int getStudentID() { return studentID; }
//     public String getName() { return name; }
//     public double getGrade() { return grade; }

//     @Override
//     public String toString() {
//         return "Student{id=" + studentID + ", name='" + name + "', grade=" + grade + "}";
//     }
// }

// class StudentSerializer {
//     public static void main(String[] args) {
//         Student student = new Student(101, "Alice", 92.5);
//         String fileName = "student.ser";

//         // Serialize
//         try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
//             oos.writeObject(student);
//             System.out.println("Serialized: " + student);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         // Deserialize
//         try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
//             Student restored = (Student) ois.readObject();
//             System.out.println("Deserialized: " + restored);
//         } catch (IOException | ClassNotFoundException e) {
//             e.printStackTrace();
//         }
//     }
// }