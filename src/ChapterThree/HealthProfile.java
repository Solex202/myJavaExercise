package ChapterThree;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int height;
    private double weightInPounds;

    public HealthProfile(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, int height, double weightInPounds){

                this.firstName = firstName;
                this.lastName = lastName;
                this.gender = gender;
                this.dayOfBirth = dayOfBirth;
                this.monthOfBirth = monthOfBirth;
                this.yearOfBirth = yearOfBirth;
                this.height = height;
                this.weightInPounds = weightInPounds;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeightInPounds() {
        return weightInPounds * 2.2046;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
    public int getAgeInYears(){
        int presentAge = 2021;
        return  presentAge -yearOfBirth;
    }
    public int  getMaximumHeartRate(){
    return 220 - getAgeInYears();
    }
    public String getTargetHeartRate(){
        double maximumHeartRate = getMaximumHeartRate();
        double lowerBound = 0.5 * maximumHeartRate;
        double upperBound = 0.85 * maximumHeartRate;
        return String.format("your target heart rate is %.3f - %.3f",lowerBound,upperBound);
    }
    public double getBodyMassIndex(){
        return (weightInPounds * 703) / (height * height);
    }
}
