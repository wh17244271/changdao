package changdao.sys.controller;


import changdao.sys.common.User;
import changdao.utils.ResponseJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import changdao.data.service.IIndexService;

@Controller
@RequestMapping(value = "/sys")
public class LoginController {
    @Autowired
    private IIndexService indexService;

    @ResponseBody
    @RequestMapping( "/login" )
    public ResponseJson login(String username, String password) {

        User user = User.getUser(username);
        if (null == user){
            return new ResponseJson(false,"没有该用户");
        }

        if (user.getPassword().equals(password)){
            return new ResponseJson(false,"密码错误");
        }
        return new ResponseJson(true,"登陆成功");

    }



}
