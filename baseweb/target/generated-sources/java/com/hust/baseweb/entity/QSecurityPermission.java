package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSecurityPermission is a Querydsl query type for SecurityPermission
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSecurityPermission extends EntityPathBase<SecurityPermission> {

    private static final long serialVersionUID = 602006844L;

    public static final QSecurityPermission securityPermission = new QSecurityPermission("securityPermission");

    public final DateTimePath<java.util.Date> createdStamp = createDateTime("createdStamp", java.util.Date.class);

    public final StringPath description = createString("description");

    public final DateTimePath<java.util.Date> lastUpdatedStamp = createDateTime("lastUpdatedStamp", java.util.Date.class);

    public final StringPath permissionId = createString("permissionId");

    public QSecurityPermission(String variable) {
        super(SecurityPermission.class, forVariable(variable));
    }

    public QSecurityPermission(Path<? extends SecurityPermission> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSecurityPermission(PathMetadata metadata) {
        super(SecurityPermission.class, metadata);
    }

}

