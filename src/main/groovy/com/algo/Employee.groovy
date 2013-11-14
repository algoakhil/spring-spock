package com.algo

import javax.persistence.Column
import javax.persistence.Entity

/**
 * User: Akhil Shastri
 * Date: 11/14/13
 * Time: 6:48 PM
 */
@Entity
class Employee extends AbstractModel {

    @Column(unique = true, nullable = false)
    String code

    @Column(nullable = false)
    String name

}
