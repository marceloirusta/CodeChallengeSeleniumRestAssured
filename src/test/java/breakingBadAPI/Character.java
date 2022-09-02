package breakingBadAPI;

import java.util.ArrayList;

public class Character {

    public int char_id;
    public String name;
    public String birthday;
    public ArrayList<String> occupation;
    public String img;
    public String status;
    public String nickname;
    public ArrayList<Integer> appearance;
    public String portrayed;
    public String category;
    public ArrayList<Integer> better_call_saul_appearance;

    public Character(int char_id, String name, String birthday, ArrayList<String> occupation, String img, String status,
    String nickname, ArrayList<Integer> appearance, String portrayed, String category, ArrayList<Integer> better_call_saul_appearance){

        this.char_id = char_id;
        this.name = name;
        this.birthday = birthday;
        this.occupation = occupation;
        this.img = img;
        this.status = status;
        this.nickname = nickname;
        this.appearance = appearance;
        this.portrayed = portrayed;
        this.category = category;
        this.better_call_saul_appearance = better_call_saul_appearance;
    }

    public Character(){

    }

    public int getChar_id() {
        return char_id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public ArrayList<String> getOccupation() {
        return occupation;
    }

    public String getImg() {
        return img;
    }

    public String getStatus() {
        return status;
    }

    public String getNickname() {
        return nickname;
    }

    public ArrayList<Integer> getAppearance() {
        return appearance;
    }

    public String getPortrayed() {
        return portrayed;
    }

    public String getCategory() {
        return category;
    }

    public ArrayList<Integer> getBetter_call_saul_appearance() {
        return better_call_saul_appearance;
    }
}
