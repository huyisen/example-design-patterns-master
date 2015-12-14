package org.huyisen.chainOfResp;

/**
 * 经理
 *
 * <p>User: Hu Yisen
 * <p>Date: 2015-12-11 08:58
 * <p>Version: 1.0
 */
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<10){
            System.out.println("员工："+request.getEmpName()+"请假，天数："+request.getLeaveDays()+",理由："+request.getReason());
            System.out.println("经理："+this.name+",审批通过！");
        }else{
            if(this.nextLeader!=null){
                this.nextLeader.handleRequest(request);
            }
        }
    }

}
