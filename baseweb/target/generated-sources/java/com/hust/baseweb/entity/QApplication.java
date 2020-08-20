package com.hust.baseweb.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QApplication is a Querydsl query type for Application
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QApplication extends EntityPathBase<Application> {

    private static final long serialVersionUID = 11005411L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QApplication application = new QApplication("application");

    public final StringPath applicationId = createString("applicationId");

    public final DateTimePath<java.util.Date> createdStamp = createDateTime("createdStamp", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastUpdatedStamp = createDateTime("lastUpdatedStamp", java.util.Date.class);

    public final QApplication module;

    public final QSecurityPermission permission;

    public final QApplicationType type;

    public QApplication(String variable) {
        this(Application.class, forVariable(variable), INITS);
    }

    public QApplication(Path<? extends Application> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QApplication(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QApplication(PathMetadata metadata, PathInits inits) {
        this(Application.class, metadata, inits);
    }

    public QApplication(Class<? extends Application> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.module = inits.isInitialized("module") ? new QApplication(forProperty("module"), inits.get("module")) : null;
        this.permission = inits.isInitialized("permission") ? new QSecurityPermission(forProperty("permission")) : null;
        this.type = inits.isInitialized("type") ? new QApplicationType(forProperty("type")) : null;
    }

}

