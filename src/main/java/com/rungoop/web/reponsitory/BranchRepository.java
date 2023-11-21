package com.rungoop.web.reponsitory;

import com.rungoop.web.entity.Branch;
import com.rungoop.web.entity.Statistical2;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
    // @Query("select new com.rungoop.web.entity.Statistical2( "+
    //         "b.address as address, count(t.id) as ticket_sale, sum(t.ticketPrice) as total_revenue )" +
    //        "from Branch b " +
    //        "join b.users u " +
    //        "join u.tickets t " +
    //        "group by b.address")
    // List<Statistical2> statistical2();
}
