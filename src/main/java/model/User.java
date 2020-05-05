package model;

public class User {
    public static final String ID_USER_COLUMN = "idUser";
    public static final String FIRST_NAME_USER_COLUMN = "firstNameUser";
    public static final String SECOND_NAME_USER_COLUMN = "secondNameUser";
    public static final String AGE_USER_COLUMN = "ageUser";
    public static final String COUNTRY_USER_COLUMN = "countryUser";
    public static final String WIN_USER_COLUMN = "winUser";
    public static final String LOSE_USER_COLUMN = "loseUser";

    private int idUser;
    private String firstNameUser;
    private String secondNameUser;
    private int ageUser;
    private String countryUser;
    private int winUser;
    private int loseUser;

    public User(){
    }

    public User(int idUser, String firstNameUser, String secondNameUser, int ageUser, String countryUser, int winUser, int loseUser){
        this.idUser = idUser;
        this.firstNameUser = firstNameUser;
        this.secondNameUser = secondNameUser;
        this.ageUser = ageUser;
        this.countryUser = countryUser;
        this.winUser = winUser;
        this.loseUser = loseUser;
    }

    public User(String firstNameUser, String secondNameUser, int ageUser, String countryUser, int winUser, int loseUser){
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

    public int getAgeUser() { return ageUser; }

    public String getCountryUser() { return countryUser; }

    public int getWinUser() { return winUser; }

    public int getLoseUser() { return loseUser; }

    public void setFirstNameUser(String firstNameUser) { this.firstNameUser = firstNameUser; }

    public void setSecondNameUser(String secondNameUser) { this.secondNameUser = secondNameUser; }

    public void setAgeUser(int ageUser) { this.ageUser = ageUser; }

    public void setCountryUser(String countryUser) { this.countryUser = countryUser; }

    public void setWinUser(int winUser) { this.winUser = winUser; }

    public void setLoseUser(int loseUser) { this.loseUser = loseUser; }

    @Override
    public String toString() {
        String sb = "User{" + "idUser=" + idUser +
                ", firstNameUser=" + firstNameUser +
                ", secondNameUser=" + secondNameUser +
                ", ageUser=" + ageUser +
                ", countryUser=" + countryUser +
                ", winUser=" + winUser +
                ", loseUser=" + loseUser +
                '}';
        return sb;
    }
}