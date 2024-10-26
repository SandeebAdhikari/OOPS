package Question_1;

public class Student {
    private String studentId;
    private String name;
    private String mobileNo;
    private String address;
    private String course;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 15) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name should not be greater than 15 characters.");
        }
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        if (mobileNo.length() == 10) {
            this.mobileNo = mobileNo;
        } else {
            throw new IllegalArgumentException("Mobile number should have exactly 10 digits.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double calculateFee() {
        switch (course.toLowerCase()) {
            case "fast-track":
                return 5000.0;
            case "corporate":
                return 7000.0;
            case "weekend":
                return 3000.0;
            case "corporate-weekend":
                return 6000.0;
            default:
                return 0.0;
        }
    }
}

