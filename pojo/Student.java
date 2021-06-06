public Class Student{

    private String name;
    private Integer age;
    private Boolean member;
    private List<String> languages = null;

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public Integer getAge() {
        return age;
    }

    
    public void setAge(Integer age) {
        this.age = age;
    }

    
    public Boolean getMember() {
        return member;
    }

   
    public void setMember(Boolean member) {
        this.member = member;
    }

    
    public List<String> getLanguages() {
        return languages;
    }

    
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

}