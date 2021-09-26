package com.thbs.taxpack;

import co.thbs.emppack.employee;
import co.thbs.emppack.manager;
import co.thbs.emppack.programmer;

public class tax {
    public static double calc_Tax(employee e)
    {
    if (e instanceof manager)

        return (e.getSal()*0.2);
        else
            if (e instanceof programmer)
                return (e.getSal()*0.1);
            else
                return (e.getSal()*0);
    }
}
