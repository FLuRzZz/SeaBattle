package model;

public class User {
    private int idUser;
    private String firstNameUser;
    private String secondNameUser;
    private String ageUser;
    private String countryUser;
    private String winUser;
    private String loseUser;

    public User(int idUser, String firstNameUser, String secondNameUser, String ageUser, String countryUser, String winUser, String loseUser){
        this.idUser = idUser;
        this.firstNameUser = firstNameUser;
        this.secondNameUser = secondNameUser;
        this.ageUser = ageUser;
        this.countryUser = countryUser;
        this.winUser = winUser;
        this.loseUser = loseUser;
    }

    public User(String firstNameUser, String secondNameUser, String ageUser, String countryUser, String winUser, String loseUser){
        this.firstNameUser = firstNameUser;
        this.secondNameUser = secondNameUser;
        this.ageUser = ageUser;
        this. countryUser = countryUser;
        this.winUser = winUser;
        this.loseUser = loseUser;
    }

    public int getIdUser() { return idUser; }

    public String getFirstNameUser() { return firstNameUser; }

    public String getSecondNameUser() { return secondNameUser; }

    public String getAgeUser() { return ageUser; }

    public String getCountryUser() { return countryUser; }

    public String getWinUser() { return winUser; }

    public String getLoseUser() { return loseUser; }

    public void setFirstNameUser(String firstNameUser) { this.firstNameUser = firstNameUser; }

    public void setSecondNameUser(String secondNameUser) { this.secondNameUser = secondNameUser; }

    public void setAgeUser(String ageUser) { this.ageUser = ageUser; }

    public void setCountryUser(String countryUser) { this.countryUser = countryUser; }

    public void setWinUser(String winUser) { this.winUser = winUser; }

    public void setLoseUser(String loseUser) { this.loseUser = loseUser; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("idUser=").append(idUser);
        sb.append(", firstNameUser=").append(firstNameUser);
        sb.append(", secondNameUser=").append(secondNameUser);
        sb.append(", ageUser=").append(ageUser);
        sb.append(", countryUser=").append(countryUser);
        sb.append(", winUser=").append(winUser);
        sb.append(", loseUser=").append(loseUser);
        sb.append('}');
        return sb.toString();
    }
}