package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserRegister is a Querydsl query type for UserRegister
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserRegister extends EntityPathBase<UserRegister> {

    private static final long serialVersionUID = -2054181541L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserRegister userRegister = new QUserRegister("userRegister");

    public final StringPath email = createString("email");

    public final StringPath fullName = createString("fullName");

    public final StringPath password = createString("password");

    public final QStatusItem statusItem;

    public final StringPath userLoginId = createString("userLoginId");

    public QUserRegister(String variable) {
        this(UserRegister.class, forVariable(variable), INITS);
    }

    public QUserRegister(Path<? extends UserRegister> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserRegister(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserRegister(PathMetadata metadata, PathInits inits) {
        this(UserRegister.class, metadata, inits);
    }

    public QUserRegister(Class<? extends UserRegister> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.statusItem = inits.isInitialized("statusItem") ? new QStatusItem(forProperty("statusItem"), inits.get("statusItem")) : null;
    }

}

