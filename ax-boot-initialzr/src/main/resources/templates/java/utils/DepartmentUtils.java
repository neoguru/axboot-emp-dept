package ${basePackage}.utils;

import ${basePackage}.domain.department.Department;
import ${basePackage}.domain.department.DepartmentService;

import com.chequer.axboot.core.code.AXBootTypes;
import com.chequer.axboot.core.context.AppContextManager;
import com.chequer.axboot.core.parameter.RequestParams;
import com.chequer.axboot.core.utils.JsonUtils;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class DepartmentUtils {

    public static List<Department> get() {
        RequestParams<Department> requestParams = new RequestParams<>(Department.class);
        requestParams.put("ynUse", AXBootTypes.Used.YES.getLabel());
        return getService().gets(requestParams);
    }

    public static Map<Integer, List<Department>> getAllByMap() {
        RequestParams<Department> requestParams = new RequestParams<>(Department.class);
        requestParams.put("ynUse", AXBootTypes.Used.YES.getLabel());
        List<Department> departments = getService().gets(requestParams);

        Map<Integer, List<Department>> departmentMap = departments.stream().collect(groupingBy(Department::getNoDepartment));

        return departmentMap;
    }

    public static String getAllByJson() {
        return JsonUtils.toJson(getAllByMap());
    }


    public static DepartmentService getService() {
        return AppContextManager.getBean(DepartmentService.class);
    }
}
