package Mapper;

public class GivenSampleMessage {
    private long messageId;
    private String name;
    private Long age;
    private String gender;


    public GivenSampleMessage(long messageId, String name, Long age, String gender) {
        this.messageId = messageId;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public long getMessageId() {
        return messageId;
    }

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
