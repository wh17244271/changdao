package changdao.sys.controller;


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
    public Object login(String username,String password) {

        if ("test".equals(username) && "test".equals(password)){
            return true;
        }

        return false;
    }



}
