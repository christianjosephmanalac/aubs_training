package Mapper;

public class Person {
    private long messageId;
    private String name;
    private Boolean isSeniorCitizen;
    private String genderColor;

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSeniorCitizen() {
        return isSeniorCitizen;
    }

    public void setSeniorCitizen(Boolean seniorCitizen) {
        isSeniorCitizen = seniorCitizen;
    }

    public String getGenderColor() {
        return genderColor;
    }

    public void setGenderColor(String genderColor) {
        this.genderColor = genderColor;
    }
}
