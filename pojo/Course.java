public Class Course{
    private String name;
    private Instructor instructor;
    private List<Student> students;
    
    public String getName() {
    return name;
    }


    public void setName(String name) {
    this.name = name;
    }


    public Instructor getInstructor() {
    return instructor;
    }


    public void setInstructor(Instructor instructor) {
    this.instructor = instructor;
    }

    public List getStudents() {
    return students;
    }


    public void setStudents(List<Student> students) {
    this.students = students;
    }
}