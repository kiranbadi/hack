USE [CaryHackTeam3]
GO

ALTER TABLE [dbo].[MemberDetails] DROP CONSTRAINT [fk_memdet_member]
GO

/****** Object:  Table [dbo].[TeacherQuestions]    Script Date: 6/4/2019 4:37:33 PM ******/
DROP TABLE [dbo].[TeacherQuestions]
GO

/****** Object:  Table [dbo].[Survey]    Script Date: 6/4/2019 4:37:33 PM ******/
DROP TABLE [dbo].[Survey]
GO

/****** Object:  Table [dbo].[StudentQuestions]    Script Date: 6/4/2019 4:37:33 PM ******/
DROP TABLE [dbo].[StudentQuestions]
GO

/****** Object:  Table [dbo].[School]    Script Date: 6/4/2019 4:37:33 PM ******/
DROP TABLE [dbo].[School]
GO

/****** Object:  Table [dbo].[MemberDetails]    Script Date: 6/4/2019 4:37:33 PM ******/
DROP TABLE [dbo].[MemberDetails]
GO

/****** Object:  Table [dbo].[Member]    Script Date: 6/4/2019 4:37:33 PM ******/
DROP TABLE [dbo].[Member]
GO

/****** Object:  Table [dbo].[Member]    Script Date: 6/4/2019 4:37:33 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[Member](
	[Member_ID] [int] IDENTITY(1,1) NOT NULL,
	[FName] [varchar](50) NOT NULL,
	[MName] [varchar](50) NULL,
	[LName] [varchar](50) NOT NULL,
	[UserName] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL,
	[MemberType] [varchar](30) NOT NULL,
	[DOB] [date] NULL,
	[ClassCode] [varchar](20) NULL,
	[CreatedDt] [date] NOT NULL CONSTRAINT [DF_Member_CreatedDt]  DEFAULT (getdate()),
	[Gender] [varchar](10) NULL,
	[GradeLevel] [varchar](30) NULL,
	[StudentID] [varchar](30) NULL,
	[SchoolName] [varchar](300) NULL,
	[TeacherName] [varchar](50) NULL,
	[email] [varchar](100) NULL,
 CONSTRAINT [PK_Member] PRIMARY KEY CLUSTERED 
(
	[Member_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[MemberDetails]    Script Date: 6/4/2019 4:37:34 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[MemberDetails](
	[MemberDetail_ID] [int] IDENTITY(1,1) NOT NULL,
	[Member_ID] [int] NOT NULL,
	[ClassName] [varchar](100) NULL,
	[Score] [int] NULL,
	[CertifiedDate] [date] NULL,
	[ClassStatus] [varchar](50) NULL,
 CONSTRAINT [PK_MemberDetails] PRIMARY KEY CLUSTERED 
(
	[MemberDetail_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[School]    Script Date: 6/4/2019 4:37:34 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[School](
	[School_ID] [int] IDENTITY(1,1) NOT NULL,
	[SchoolName] [varchar](300) NOT NULL,
	[Country] [varchar](50) NULL,
	[County] [varchar](50) NULL,
	[City] [varchar](50) NULL,
	[State] [varchar](50) NULL,
	[Zipcode] [varchar](20) NULL,
 CONSTRAINT [PK_School] PRIMARY KEY CLUSTERED 
(
	[School_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[StudentQuestions]    Script Date: 6/4/2019 4:37:35 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[StudentQuestions](
	[StudentQuestion_ID] [int] IDENTITY(1,1) NOT NULL,
	[Topiccode] [varchar](5) NULL,
	[Difficulty] [varchar](2) NULL,
	[CorrectAns] [int] NULL,
	[Item] [varchar](1000) NULL,
	[ClassName] [varchar](100) NULL,
 CONSTRAINT [PK_StudentSurvey] PRIMARY KEY CLUSTERED 
(
	[StudentQuestion_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[Survey]    Script Date: 6/4/2019 4:37:35 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[Survey](
	[Survey_ID] [int] IDENTITY(1,1) NOT NULL,
	[FirstName] [varchar](50) NULL,
	[LastName] [varchar](50) NULL,
	[Phone] [varchar](20) NULL,
	[email] [varchar](100) NULL,
	[MailingAddress] [varchar](300) NULL,
	[HighSchool] [varchar](100) NULL,
	[YearCertified] [varchar](4) NULL,
	[CollegeUniversity] [varchar](100) NULL,
	[UnderGradDegree] [varchar](10) NULL,
	[YearGraduated] [varchar](4) NULL,
	[AfterGraduated] [varchar](50) NULL,
	[GradSchool] [varchar](50) NULL,
	[GradSchoolMajor] [varchar](50) NULL,
	[GradScoolCompletedYear] [varchar](4) NULL,
	[OrganizationName] [varchar](100) NULL,
	[JobTitle] [varchar](100) NULL,
	[LikeToVolunteer] [varchar](1) NULL,
	[CFLRegistry] [varchar](1) NULL,
 CONSTRAINT [PK_Survey] PRIMARY KEY CLUSTERED 
(
	[Survey_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
)

GO

SET ANSI_PADDING OFF
GO

/****** Object:  Table [dbo].[TeacherQuestions]    Script Date: 6/4/2019 4:37:37 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[TeacherQuestions](
	[TeacherQuestion_ID] [int] IDENTITY(1,1) NOT NULL,
	[TopicCode] [varchar](5) NULL,
	[Difficulty] [varchar](2) NULL,
	[CorrectAns] [int] NULL,
	[Item] [varchar](1000) NULL,
	[ClassName] [varchar](1000) NULL
)

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[MemberDetails]  WITH CHECK ADD  CONSTRAINT [fk_memdet_member] FOREIGN KEY([Member_ID])
REFERENCES [dbo].[Member] ([Member_ID])
GO

ALTER TABLE [dbo].[MemberDetails] CHECK CONSTRAINT [fk_memdet_member]
GO


