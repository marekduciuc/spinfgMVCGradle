package com.duciuc.smallcrm.web;

import com.duciuc.smallcrm.domain.WorkOrder;
import com.duciuc.smallcrm.service.WorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("workordersform")
@SessionAttributes("WorkOrder")
public class WorkOrderFormControler {
    private WorkOrderService workOrderService;

    @Autowired
    public WorkOrderFormControler(WorkOrderService workOrderService) {
        this.workOrderService = workOrderService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setUpForm(Model model) {
        WorkOrder workOrder = new WorkOrder();
        model.addAttribute("WorkOrder", workOrder);
        return "workOrderForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String SubmitForm(@ModelAttribute("WorkOrder") WorkOrder workOrder, BindingResult result, SessionStatus sataus) {
        workOrderService.addOrder(workOrder);
        return ("redirect:workOrderSuccess");
    }

}
