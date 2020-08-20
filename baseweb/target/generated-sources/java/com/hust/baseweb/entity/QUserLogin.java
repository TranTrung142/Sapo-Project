package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserLogin is a Querydsl query type for UserLogin
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserLogin extends EntityPathBase<UserLogin> {

    private static final long serialVersionUID = -1976980559L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserLogin userLogin = new QUserLogin("userLogin");

    public final StringPath clientToken = createString("clientToken");

    public final DateTimePath<java.util.Date> disabledDateTime = createDateTime("disabledDateTime", java.util.Date.class);

    public final BooleanPath enabled = createBoolean("enabled");

    public final BooleanPath hasLoggedOut = createBoolean("hasLoggedOut");

    public final BooleanPath isSystem = createBoolean("isSystem");

    public final NumberPath<Integer> otpResendNumber = createNumber("otpResendNumber", Integer.class);

    public final StringPath otpSecret = createString("otpSecret");

    public final QParty party;

    public final StringPath password = createString("password");

    public final StringPath passwordHint = createString("passwordHint");

    public final BooleanPath requirePasswordChange = createBoolean("requirePasswordChange");

    public final SetPath<SecurityGroup, QSecurityGroup> roles = this.<SecurityGroup, QSecurityGroup>createSet("roles", SecurityGroup.class, QSecurityGroup.class, PathInits.DIRECT2);

    public final NumberPath<Integer> successiveFailedLogins = createNumber("successiveFailedLogins", Integer.class);

    public final StringPath userLoginId = createString("userLoginId");

    public QUserLogin(String variable) {
        this(UserLogin.class, forVariable(variable), INITS);
    }

    public QUserLogin(Path<? extends UserLogin> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserLogin(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserLogin(PathMetadata metadata, PathInits inits) {
        this(UserLogin.class, metadata, inits);
    }

    public QUserLogin(Class<? extends UserLogin> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.party = inits.isInitialized("party") ? new QParty(forProperty("party"), inits.get("party")) : null;
    }

}

