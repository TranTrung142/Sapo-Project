package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoleType is a Querydsl query type for RoleType
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRoleType extends EntityPathBase<RoleType> {

    private static final long serialVersionUID = -1172016867L;

    public static final QRoleType roleType = new QRoleType("roleType");

    public final StringPath roleTypeId = createString("roleTypeId");

    public QRoleType(String variable) {
        super(RoleType.class, forVariable(variable));
    }

    public QRoleType(Path<? extends RoleType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoleType(PathMetadata metadata) {
        super(RoleType.class, metadata);
    }

}

