package ssx.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ssx.schema.DBSchemaB;
import ssx.service.ServiceB;

@Controller
public class ControllerB {

    private Logger logger= Logger.getLogger(ControllerB.class);

    @Autowired
    ServiceB serviceB;

    @RequestMapping("bb/{action}.do")
    public String funB(Model model, @PathVariable(name = "action") int ac){
        logger.info("开始查询ServiceB");
        DBSchemaB query = this.serviceB.query(ac);
        model.addAttribute("byid",query.getName());
        return "/querySuccess.jsp";
    }

    @RequestMapping(value = "bb/add.do" ,method = RequestMethod.GET)
    public String funBB(DBSchemaB dbSchemaB){
        String name = dbSchemaB.getName();
        int id = dbSchemaB.getId();
        serviceB.add(dbSchemaB);
        return "/addSuccess.jsp";
    }
}
