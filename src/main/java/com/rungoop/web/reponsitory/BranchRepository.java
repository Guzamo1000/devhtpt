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
    @Query(value = "select branchs.address as address, count(tickets.id) as ticketSale, sum(tickets.ticket_price) as totalRevenue "+
    "from branchs "+
    "inner join users "+
    "on branchs.id=users.branch_id "+
    "inner join tickets "+
    "on users.id=tickets.user_id "+
    "group by branchs.address ", nativeQuery = true)
    List<static2> getTicketAndMoney();
    // List<Branch> findById(long id);
    // @Query(value = "select new com.rungoop.web.entity.Statistical2( "+
    //         "b.address, count(t.id),sum(t.ticketPrice) )" +
    //        "from Branch b " +
    //        "join b.users u on b.id=u.branchId" +
    //        "join u.tickets t on u.id=t.userId" +
    //        "group by b.address ",nativeQuery=true)
    // List<Statistical2> getTicketAndMoney();
    public static interface static2 {
        String getAddress();
        Integer getTicketSale();
        Double getTotalRevenue();
    }
} 
