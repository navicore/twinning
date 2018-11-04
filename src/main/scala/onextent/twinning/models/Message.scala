package onextent.twinning.models

import java.util.{Date, UUID}

final case class Message(
    id: UUID,
    datetime: Date,
    body: String
)

