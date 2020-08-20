package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSecurityGroup is a Querydsl query type for SecurityGroup
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSecurityGroup extends EntityPathBase<SecurityGroup> {

    private static final long serialVersionUID = -2023741710L;

    public static final QSecurityGroup securityGroup = new QSecurityGroup("securityGroup");

    public final DateTimePath<java.util.Date> createdStamp = createDateTime("createdStamp", java.util.Date.class);

    public final StringPath description = createString("description");

    public final StringPath groupId = createString("groupId");

    public final DateTimePath<java.util.Date> lastUpdatedStamp = createDateTime("lastUpdatedStamp", java.util.Date.class);

    public final ListPath<SecurityPermission, QSecurityPermission> permissions = this.<SecurityPermission, QSecurityPermission>createList("permissions", SecurityPermission.class, QSecurityPermission.class, PathInits.DIRECT2);

    public QSecurityGroup(String variable) {
        super(SecurityGroup.class, forVariable(variable));
    }

    public QSecurityGroup(Path<? extends SecurityGroup> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSecurityGroup(PathMetadata metadata) {
        super(SecurityGroup.class, metadata);
    }

}

