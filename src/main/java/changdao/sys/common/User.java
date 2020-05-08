package changdao.sys.common;

public enum User {
    admin("admin","admin"),
    test("test","test")
    ;
    private String username;
    private String password;

    /**
     * 通过用户名获取用户
     * @param username
     * @return
     */
    public static User getUser(String username){
        User find = null;
        User[] users = values();
        for (User user:users){
            if (user.getUsername().equals(username)){
                find = user;
                break;
            }
        }
        return find;
    }



    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
