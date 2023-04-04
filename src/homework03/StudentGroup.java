package homework03;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private String groupName;
    private Integer groupId;
    private List<Student> studentList = new ArrayList<>();
    private Teacher teacher;

    StudentGroup(String groupName, Integer groupId, Teacher teacher) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.teacher = teacher;
        teacher.addStudentGroup(this);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        if (!studentList.contains(student))
            studentList.add(student);
    }

    public void setTeacher(Teacher teacher) {
        if (this.teacher != null) {
            this.teacher.removeStudentGroup(this);
        }
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public String toString() {
        return String.format("groupName: %s groupId: %d teacher: %s", groupName, groupId, teacher);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StudentGroup && ((StudentGroup) obj).groupId.equals(groupId))
            return true;
        return false;
    }
}
