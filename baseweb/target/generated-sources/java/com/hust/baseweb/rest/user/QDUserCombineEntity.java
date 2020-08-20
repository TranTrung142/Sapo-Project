package com.hust.baseweb.rest.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDUserCombineEntity is a Querydsl query type for DUserCombineEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDUserCombineEntity extends EntityPathBase<DUserCombineEntity> {

    private static final long serialVersionUID = 218936250L;

    public static final QDUserCombineEntity dUserCombineEntity = new QDUserCombineEntity("dUserCombineEntity");

    public final DatePath<java.sql.Date> birthDate = createDate("birthDate", java.sql.Date.class);

    public final StringPath firstName = createString("firstName");

    public final StringPath gender = createString("gender");

    public final StringPath lastName = createString("lastName");

    public final StringPath middleName = createString("middleName");

    public final ComparablePath<java.util.UUID> partyId = createComparable("partyId", java.util.UUID.class);

    public final StringPath userLoginId = createString("userLoginId");

    public QDUserCombineEntity(String variable) {
        super(DUserCombineEntity.class, forVariable(variable));
    }

    public QDUserCombineEntity(Path<? extends DUserCombineEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDUserCombineEntity(PathMetadata metadata) {
        super(DUserCombineEntity.class, metadata);
    }

}

