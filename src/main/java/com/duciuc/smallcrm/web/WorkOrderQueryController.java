package com.duciuc.smallcrm.web;

import com.duciuc.smallcrm.domain.WorkOrder;
import com.duciuc.smallcrm.service.WorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/workorders")
public class WorkOrderQueryController {

    private WorkOrderService workOrderService;


    public WorkOrderQueryController() {
    }

    @Autowired
    public WorkOrderQueryController(WorkOrderService workOrderService) {
        this.workOrderService = workOrderService;
    }

    // Controller will always look for a default GET method to call first, irrespective of name
    // In this case, named setupForm to ease identification
    @RequestMapping(method = RequestMethod.GET)
    public String setupForm() {
        return "workOrderQuery";
    }


    // Controller will always look for a default POST method irrespective of name
    // when a submission ocurrs on the URL (i.e.@RequestMapping(/reservationQuery))
    // In this case, named submitForm to ease identification
    @RequestMapping(method = RequestMethod.POST)
    // Submission will come with courtName field, also add Model to return results
    public String sumbitForm(@RequestParam("customerName") String customerName, Model model) {
        // Create reservation list
        List<WorkOrder> workorders = java.util.Collections.emptyList();
        // Make a query if parameter is not null
        if (customerName != null) {
            workorders = workOrderService.getOrdersForCustomer(customerName);
        }
        // Update model to include reservations
        model.addAttribute("workorders", workorders);
        // Return view as a string
        // Based on resolver configuration the reservationQuery view
        // will be mapped to a JSP in /WEB-INF/jsp/reservationQuery.jsp
        return "workOrderQuery";
    }
}


