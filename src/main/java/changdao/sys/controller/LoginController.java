package changdao.sys.controller;


import changdao.sys.common.User;
import changdao.utils.ResponseJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import changdao.data.service.IIndexService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/sys")
public class LoginController {
    @Autowired
    private IIndexService indexService;

    @ResponseBody
    @RequestMapping( "/login" )
    public ResponseJson login(String username, String password, HttpServletRequest request) {

        User user = User.getUser(username);
        if (null == user){
            return new ResponseJson(false,"没有该用户");
        }

        if (!user.getPassword().equals(password)){
            return new ResponseJson(false,"密码错误");
        }
        request.getSession().setAttribute("username",username);
        return new ResponseJson(true,"登陆成功");

    }

    /**
     * 退出
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping( "/logout" )
    public ResponseJson logout(HttpServletRequest request) {

        request.getSession().setAttribute("username",null);
        return new ResponseJson(true,"退出成功");

    }





}
