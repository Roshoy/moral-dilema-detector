//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.3
//
// <auto-generated>
//
// Generated from file `adapter.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package adapter;

public enum RoadAttribute implements java.io.Serializable
{
    FERRY(0),
    TUNNEL(1),
    BRIDGE(2),
    TOLL(3),
    CONTROLLEDACCES(4),
    SERVICEAREA(5),
    URBAN(6),
    MOTORWAY(7);

    public int value()
    {
        return _value;
    }

    public static RoadAttribute valueOf(int v)
    {
        switch(v)
        {
        case 0:
            return FERRY;
        case 1:
            return TUNNEL;
        case 2:
            return BRIDGE;
        case 3:
            return TOLL;
        case 4:
            return CONTROLLEDACCES;
        case 5:
            return SERVICEAREA;
        case 6:
            return URBAN;
        case 7:
            return MOTORWAY;
        }
        return null;
    }

    private RoadAttribute(int v)
    {
        _value = v;
    }

    public void ice_write(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeEnum(_value, 7);
    }

    public static void ice_write(com.zeroc.Ice.OutputStream ostr, RoadAttribute v)
    {
        if(v == null)
        {
            ostr.writeEnum(adapter.RoadAttribute.FERRY.value(), 7);
        }
        else
        {
            ostr.writeEnum(v.value(), 7);
        }
    }

    public static RoadAttribute ice_read(com.zeroc.Ice.InputStream istr)
    {
        int v = istr.readEnum(7);
        return validate(v);
    }

    public static void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<RoadAttribute> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    public static void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, RoadAttribute v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.Size))
        {
            ice_write(ostr, v);
        }
    }

    public static java.util.Optional<RoadAttribute> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.Size))
        {
            return java.util.Optional.of(ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static RoadAttribute validate(int v)
    {
        final RoadAttribute e = valueOf(v);
        if(e == null)
        {
            throw new com.zeroc.Ice.MarshalException("enumerator value " + v + " is out of range");
        }
        return e;
    }

    private final int _value;
}
