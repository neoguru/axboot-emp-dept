package ${basePackage}.domain;

import ${basePackage}.domain.code.QCommonCode;
import ${basePackage}.domain.file.QCommonFile;
import ${basePackage}.domain.program.QProgram;
import ${basePackage}.domain.program.menu.QMenu;
import ${basePackage}.domain.program.mobileMenu.QMobileMenu;
import ${basePackage}.domain.user.QUser;
import ${basePackage}.domain.user.auth.QUserAuth;
import ${basePackage}.domain.user.auth.menu.QAuthGroupMenu;
import ${basePackage}.domain.user.role.QUserRole;

import ${basePackage}.domain.base.notice.QNotice;
import ${basePackage}.domain.base.notice.attach.QNoticeAttach;
import ${basePackage}.domain.base.scheduler.QScheduler;
import ${basePackage}.domain.base.scheduler.repeat.QSchedulerRepeat;
import ${basePackage}.domain.base.scheduler.repeat.change.QSchedulerRepeatChange;
import ${basePackage}.domain.base.employee.QEmployee;

import com.chequer.axboot.core.domain.base.AXBootBaseService;
import com.chequer.axboot.core.domain.base.AXBootJPAQueryDSLRepository;

import java.io.Serializable;


public class BaseService<T, ID extends Serializable> extends AXBootBaseService<T, ID> {

    protected QUserRole qUserRole = QUserRole.userRole;
    protected QAuthGroupMenu qAuthGroupMenu = QAuthGroupMenu.authGroupMenu;
    protected QCommonCode qCommonCode = QCommonCode.commonCode;
    protected QUser qUser = QUser.user;
    protected QProgram qProgram = QProgram.program;
    protected QUserAuth qUserAuth = QUserAuth.userAuth;
    protected QMenu qMenu = QMenu.menu;
    protected QCommonFile qCommonFile = QCommonFile.commonFile;

    protected QMobileMenu qMobileMenu = QMobileMenu.mobileMenu;
    protected QNotice qNotice = QNotice.notice;
    protected QNoticeAttach qNoticeAttach = QNoticeAttach.noticeAttach;
    protected QScheduler qScheduler = QScheduler.scheduler;
    protected QSchedulerRepeat qSchedulerRepeat = QSchedulerRepeat.schedulerRepeat;
    protected QSchedulerRepeatChange qSchedulerRepeatChange = QSchedulerRepeatChange.schedulerRepeatChange;
    
    protected QEmployee qEmployee = QEmployee.employee;
        
    protected AXBootJPAQueryDSLRepository<T, ID> repository;

    public BaseService() {
        super();
    }

    public BaseService(AXBootJPAQueryDSLRepository<T, ID> repository) {
        super(repository);
        this.repository = repository;
    }
}
