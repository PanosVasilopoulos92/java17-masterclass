package section16.challenge246minipirategame.sealed;

public sealed abstract class SpecialAbstractClass permits FinalKid,
        NonSealedKid, SealedKid, SpecialAbstractClass.Kid {

    final class Kid extends SpecialAbstractClass {

    }

}
