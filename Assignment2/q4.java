class Student {
    private String name;
    private String rollNumber;
    private int totalMarks;

    public Student(String name, String rollNumber, int totalMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public static Student linearSearch(Student[] students, String targetRollNumber) {
        for (Student student : students) {
            if (student.getRollNumber().equals(targetRollNumber)) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Create an array of student objects
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("Alice", "S123", 85);
        studentArray[1] = new Student("Bob", "S456", 92);
        studentArray[2] = new Student("Carol", "S789", 78);

        // Search for a student by roll number
        String targetRollNumber = "S456";
        Student foundStudent = linearSearch(studentArray, targetRollNumber);

        if (foundStudent != null) {
            System.out.println("Student found:");
            System.out.println("Name: " + foundStudent.getName());
            System.out.println("Roll Number: " + foundStudent.getRollNumber());
            System.out.println("Total Marks: " + foundStudent.getTotalMarks());
        } else {
            System.out.println("Student with roll number " + targetRollNumber + " not found.");
        }
    }
}
