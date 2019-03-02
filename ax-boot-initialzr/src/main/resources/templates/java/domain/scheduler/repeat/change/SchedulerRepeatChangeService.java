package ${basePackage}.domain.scheduler.repeat.change;

import ${basePackage}.domain.BaseService;
import ${basePackage}.domain.scheduler.Scheduler;
import ${basePackage}.domain.scheduler.repeat.SchedulerRepeat;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import com.chequer.axboot.core.parameter.RequestParams;
import com.querydsl.core.BooleanBuilder;

import java.time.LocalDate;
import java.util.List;

@Service
public class SchedulerRepeatChangeService extends BaseService<SchedulerRepeatChange, Integer> {
    private SchedulerRepeatChangeRepository schedulerRepeatChangeRepository;

    @Inject
    public SchedulerRepeatChangeService(SchedulerRepeatChangeRepository schedulerRepeatChangeRepository) {
        super(schedulerRepeatChangeRepository);
        this.schedulerRepeatChangeRepository = schedulerRepeatChangeRepository;
    }

    public List<SchedulerRepeatChange> getChangeList(Integer noSchedule) {

    	List<SchedulerRepeatChange> changeList = schedulerRepeatChangeRepository.findByNoSchedule(noSchedule);
    	return changeList;
    	
    }
    
    public List<SchedulerRepeatChange> gets(RequestParams requestParams) {

        return findAll();
    }
}